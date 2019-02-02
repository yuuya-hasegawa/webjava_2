package jp.co.systena.tigerscave.SpringHelloSystena.application.model.monster;

import java.util.Objects;
import java.util.Random;
import jp.co.systena.tigerscave.SpringHelloSystena.application.conf.MonsterConst;
import jp.co.systena.tigerscave.SpringHelloSystena.application.lib.Art;

public class GrassMonster extends CommonMonster {
  protected String monsterName = "grass";
  protected int attackPoint = 7;
  protected int agilityPoint = 30;
  protected int type = MonsterConst.grassType;
  protected int specialtyType = MonsterConst.waterType;
  protected int weakType = MonsterConst.flameType;

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
    Art artOne = new Art("たいあたり", 5);
    return artOne;
  }

  @Override
  protected Art artTwo() {
    Art artTwo = new Art("ハッパカッター", 6);
    return artTwo;
  }

  @Override
  protected Art artThree() {
    Art artThree = new Art("つるのムチ", 7);
    return artThree;
  }

  @Override
  protected Art artFour() {
    Art artFour = new Art("ソーラービーム", 8);
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
