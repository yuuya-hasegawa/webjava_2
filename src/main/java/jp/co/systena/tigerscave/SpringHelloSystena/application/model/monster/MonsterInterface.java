package jp.co.systena.tigerscave.SpringHelloSystena.application.model.monster;

public interface MonsterInterface {
  String[] attack(); //技選択＋素ダメージ算出、戻り値：["技名", "素のダメージ値"]
  boolean avoidance(); //回避判定
  void damege(int damegePoint); //ダメージ反映
  double typeCorrection(int enemyType); // 属性補正
}