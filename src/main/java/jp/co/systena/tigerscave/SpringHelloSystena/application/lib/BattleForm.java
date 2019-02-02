package jp.co.systena.tigerscave.SpringHelloSystena.application.lib;

import jp.co.systena.tigerscave.SpringHelloSystena.application.conf.MonsterConst;

public class BattleForm {
  private String monsterOneName;
  private String monsterTwoName;
  private int battleStage;
  private String[] monsterList = MonsterConst.monsterNameList;

  public String getMonsterOneName() {
    return this.monsterOneName;
  }
  public void setMonsterOneName(String monsterOneName) {
    this.monsterOneName = monsterOneName;
  }
  public String getMonsterTwoName() {
    return this.monsterTwoName;
  }
  public void setMonsterTwoName(String monsterTwoName) {
    this.monsterTwoName = monsterTwoName;
  }
  public int getBattleStage() {
    return this.battleStage;
  }
  public void setBattleStage(int battleStage) {
    this.battleStage = battleStage;
  }
  public String[] getMonsterList() {
    return monsterList;
  }
  public void setMonsterList() {
    // 外部からの更新不可
  }
}
