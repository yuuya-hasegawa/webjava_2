package jp.co.systena.tigerscave.SpringHelloSystena.application.model.stage;

import jp.co.systena.tigerscave.SpringHelloSystena.application.conf.MonsterConst;

public class FlameStage extends CommonStage {
  int type = MonsterConst.flameType;

  @Override
  protected int getType() {
    return this.type;
  }

}
