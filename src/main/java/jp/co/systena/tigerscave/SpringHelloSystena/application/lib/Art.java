package jp.co.systena.tigerscave.SpringHelloSystena.application.lib;

public class Art {
  String artName;
  int artPower;

  public Art(String artName, int artPower) {
    this.artName = artName;
    this.artPower = artPower;
  }
  public String getArtName() {
    return this.artName;
  }

  public void setArtName(String artName) {
    this.artName = artName;
  }

  public int getArtPower() {
    return this.artPower;
  }

  public void setArtPower(int artPower) {
    this.artPower = artPower;
  }
}
