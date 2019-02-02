package jp.co.systena.tigerscave.SpringHelloSystena.application.controller;

import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.SpringHelloSystena.application.lib.BattleForm;
import jp.co.systena.tigerscave.SpringHelloSystena.application.model.battle.Battle;

@Controller  // Viewあり。Viewを返却するアノテーション
public class BattleController {

//  @ModelAttribute
//  BattleForm setUpForm () {
//    return new BattleForm();
//  }

  @Autowired
  HttpSession session;                  // セッション管理

  @RequestMapping(value="/battleofmonster", method = RequestMethod.GET)          // URLとのマッピング
  public ModelAndView show(ModelAndView mav) {
    // モンスター一覧を取得
    BattleForm battleForm = new BattleForm();
    mav.addObject("battleForm", battleForm);
    // Viewのテンプレート名を設定
    mav.setViewName("monsterselect");
    return mav;
  }

  @RequestMapping(value="/battleofmonster", method = RequestMethod.POST)          // URLとのマッピング
  public ModelAndView battle(@ModelAttribute BattleForm battleForm, ModelAndView mav) {
    // モンスター取得
    ArrayList<String> battleLog = new Battle().play(battleForm.getMonsterOneName(), battleForm.getMonsterTwoName(), battleForm.getBattleStage());
    mav.addObject("battleLog", battleLog);
    // Viewのテンプレート名を設定
    mav.setViewName("battle");
    return mav;
  }
}
