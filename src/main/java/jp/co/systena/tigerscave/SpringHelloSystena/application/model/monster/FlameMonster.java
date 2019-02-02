package jp.co.systena.tigerscave.SpringHelloSystena.application.model.monster;

import java.util.Objects;
import java.util.Random;
import jp.co.systena.tigerscave.SpringHelloSystena.application.conf.MonsterConst;
import jp.co.systena.tigerscave.SpringHelloSystena.application.lib.Art;

public class FlameMonster extends CommonMonster {
  protected String monsterName = "flame";
  protected int attackPoint = 8;
  protected int agilityPoint = 20;
  protected int type = MonsterConst.flameType;
  protected int specialtyType = MonsterConst.grassType;
  protected int weakType = MonsterConst.waterType;

  public String getMonsterName() {
    return this.monsterName;
  }

  public int getHitPoint() {
    return this.hitPoint;
  }

  public int getattackPoint() {
    return this.attackPoint;
  }

  public int getAgilityPoint() {
    return this.agilityPoint;
  }

  public int getType() {
    return this.type;
  }

  public int getSpecialtyType() {
    return this.specialtyType;
  }

  public int getWweakType() {
    return this.weakType;
  }

  @Override
  protected Art artOne() {
    Art artOne = new Art("ファイアボール", 6);
    return artOne;
  }

  @Override
  protected Art artTwo() {
    Art artTwo = new Art("フレイムバレット", 7);
    return artTwo;
  }

  @Override
  protected Art artThree() {
    Art artThree = new Art("だいもんじ", 8);
    return artThree;
  }

  @Override
  protected Art artFour() {
    Art artFour = new Art("イグニートプリズン", 9);
    return artFour;
  }

  public String[] attack() {
    Art art = null;
    int attackPattern = new Random().nextInt(MonsterConst.artPatternNum);

    switch (attackPattern) {
      case MonsterConst.artOne:
        art = this.artOne();
        break;
      case MonsterConst.artTwo:
        art = this.artTwo();
        break;
      case MonsterConst.artThree:
        art = this.artThree();
        break;
      case MonsterConst.artFour:
        art = this.artFour();
        break;
      default:
        if (Objects.isNull(art)) {
          art = this.artOne();
        }
    }
    int damage = this.attackPoint + art.getArtPower();

    String[] attack = {art.getArtName(), Integer.toString(damage)};
    return attack;
  }

  public boolean avoidance() {
    int judgmentCount = new Random().nextInt(100) + 1;
    boolean avoidance;
    if (judgmentCount <= this.agilityPoint) {
      avoidance = true;
    } else {
      avoidance = false;
    }
    return avoidance;
  }

  public void damege(int damegePoint) {
    this.hitPoint -= damegePoint;
  }

  public double typeCorrection(int enemyType) {
    double correction = 1;
    if (this.specialtyType == enemyType) {
      correction = 1.25;
    } else if(this.weakType == enemyType) {
      correction = 0.75;
    }
    return correction;
  }
}
