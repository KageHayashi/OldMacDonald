class NamedCow extends Cow {
  String name;
  public NamedCow(String type, String cowname, String sound) {
    name = cowname;
    myType = type;
    mySound = sound;;
  }
  public String getName() {
    return name;
  }
}
