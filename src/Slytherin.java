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

}
