package jp.co.systena.tigerscave.SpringHelloSystena.application.model.stage;

import jp.co.systena.tigerscave.SpringHelloSystena.application.conf.MonsterConst;

public class GrassStage extends CommonStage {
  int type = MonsterConst.grassType;

  @Override
  protected int getType() {
    return type;
  }
}
