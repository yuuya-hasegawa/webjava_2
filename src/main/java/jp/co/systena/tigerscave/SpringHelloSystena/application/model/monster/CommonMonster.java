package jp.co.systena.tigerscave.SpringHelloSystena.application.model.monster;

import jp.co.systena.tigerscave.SpringHelloSystena.application.lib.Art;

public abstract class CommonMonster {
  protected String monsterName;
  protected int hitPoint = 100;
  protected int attackPoint;
  protected int agilityPoint;
  protected int specialtyType;
  protected int weakType;

  protected abstract Art artOne();
  protected abstract Art artTwo();
  protected abstract Art artThree();
  protected abstract Art artFour();
}
