package jp.co.systena.tigerscave.SpringHelloSystena.application.model.stage;

import jp.co.systena.tigerscave.SpringHelloSystena.application.conf.MonsterConst;

public class WaterStage extends CommonStage {
  int type = MonsterConst.waterType;

  @Override
  protected int getType() {
    return type;
  }

}
