public class Slytherin extends Hogwarts {
  //хитрость, решительность, амбициозность, находчивость, власть
  private int cunning;
  private int determination;
  private int ambition;
  private int resourcefulness;
  private int power;

  public Slytherin(String name, String surname, int powerMagic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int power) {
    super(name, surname, powerMagic, transgression);
    this.cunning = cunning;
    this.determination = determination;
    this.ambition = ambition;
    this.resourcefulness = resourcefulness;
    this.power = power;
  }

  public int getCunning() {
    return cunning;
  }

  public int getDetermination() {
    return determination;
  }

  public int getAmbition() {
    return ambition;
  }

  public int getResourcefulness() {
    return resourcefulness;
  }

  public int getPower() {
    return power;
  }

  public void setCunning(int cunning) {
    this.cunning = cunning;
  }

  public void setDetermination(int determination) {
    this.determination = determination;
  }

  public void setAmbition(int ambition) {
    this.ambition = ambition;
  }

  public void setResourcefulness(int resourcefulness) {
    this.resourcefulness = resourcefulness;
  }

  public void setPower(int power) {
    this.power = power;
  }
}
