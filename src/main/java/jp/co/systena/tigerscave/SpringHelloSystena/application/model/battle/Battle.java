package jp.co.systena.tigerscave.SpringHelloSystena.application.model.battle;

import java.util.ArrayList;
import jp.co.systena.tigerscave.SpringHelloSystena.application.model.monster.FlameMonster;
import jp.co.systena.tigerscave.SpringHelloSystena.application.model.monster.GrassMonster;
import jp.co.systena.tigerscave.SpringHelloSystena.application.model.monster.WaterMonster;

public class Battle {

  FlameMonster flameMonsterOne = new FlameMonster();
  WaterMonster waterMonsterOne = new WaterMonster();
  GrassMonster grassMonsterOne = new GrassMonster();
  FlameMonster flameMonsterTwo = new FlameMonster();
  WaterMonster waterMonsterTwo = new WaterMonster();
  GrassMonster grassMonsterTwo = new GrassMonster();

  public ArrayList<String> play(String monsterOneName, String monsterTwoName, int stageType) {
    // 選択したモンスターを判定
//    int monsterOne = MonsterConst.flameType;
//    if (MonsterConst.monsterNameList[0].contains(monsterOneName)) {
//      monsterOne = MonsterConst.flameType;
//    } else if (MonsterConst.monsterNameList[1].contains(monsterOneName)) {
//      monsterOne = MonsterConst.waterType;
//    } else if (MonsterConst.monsterNameList[2].contains(monsterOneName)) {
//      monsterOne = MonsterConst.grassType;
//    }
//    int monsterTwo = MonsterConst.flameType;
//    if (MonsterConst.monsterNameList[0].contains(monsterTwoName)) {
//      monsterTwo = MonsterConst.flameType;
//    } else if (MonsterConst.monsterNameList[1].contains(monsterTwoName)) {
//      monsterTwo = MonsterConst.waterType;
//    } else if (MonsterConst.monsterNameList[2].contains(monsterTwoName)) {
//      monsterTwo = MonsterConst.grassType;
//    }
    // TODO 選択したモンスターを使うようにする。

    // 戻り値となるパラメータの初期化
    ArrayList<String> battleLog = new ArrayList<String>();
    battleLog.add(monsterOneName + " vs " + monsterTwoName);
    battleLog.add("バトルスタート");
    // バトルループ開始
    do {
      if (flameMonsterOne.getAgilityPoint() >= flameMonsterTwo.getAgilityPoint()) {
        // monsterOneの方が早い
        battleLog.add(monsterOneName + "の攻撃");
        if (flameMonsterTwo.avoidance()) {
          battleLog.add(monsterTwoName + "は回避した");
        } else {
          String[] attack = flameMonsterOne.attack();
          battleLog.add(monsterOneName + "の" + attack[0]);
          flameMonsterTwo.damege(Integer.parseInt(attack[1]));
          battleLog.add(monsterTwoName + "は" + attack[1] + "のダメージ");
        }
        if (0 >= flameMonsterTwo.getHitPoint()) {
          battleLog.add(monsterTwoName + "は倒れた");
          break;
        }
        battleLog.add(monsterTwoName + "の攻撃");
        if (flameMonsterOne.avoidance()) {
          battleLog.add(monsterOneName + "は回避した");
        } else {
          String[] attack = flameMonsterTwo.attack();
          battleLog.add(monsterTwoName + "の" + attack[0]);
          flameMonsterOne.damege(Integer.parseInt(attack[1]));
          battleLog.add(monsterOneName + "は" + attack[1] + "のダメージ");
        }
        if (0 >= flameMonsterOne.getHitPoint()) {
          battleLog.add(monsterOneName + "は倒れた");
          break;
        }
      } else {
        battleLog.add(monsterTwoName + "の攻撃");
        if (flameMonsterOne.avoidance()) {
          battleLog.add(monsterOneName + "は回避した");
        } else {
          String[] attack = flameMonsterTwo.attack();
          battleLog.add(monsterTwoName + "の" + attack[0]);
          flameMonsterOne.damege(Integer.parseInt(attack[1]));
          battleLog.add(monsterOneName + "は" + attack[1] + "のダメージ");
        }
        if (0 >= flameMonsterOne.getHitPoint()) {
          battleLog.add(monsterOneName + "は倒れた");
          break;
        }
        battleLog.add(monsterOneName + "の攻撃");
        if (flameMonsterTwo.avoidance()) {
          battleLog.add(monsterTwoName + "は回避した");
        } else {
          String[] attack = flameMonsterOne.attack();
          battleLog.add(monsterOneName + "の" + attack[0]);
          flameMonsterTwo.damege(Integer.parseInt(attack[1]));
          battleLog.add(monsterTwoName + "は" + attack[1] + "のダメージ");
        }
        if (0 >= flameMonsterTwo.getHitPoint()) {
          battleLog.add(monsterTwoName + "は倒れた");
          break;
        }
      }
    }while (0 < flameMonsterOne.getHitPoint() && 0 < flameMonsterTwo.getHitPoint());
    return battleLog;
  }
}
