class Event {
  String Id;
  String Name;
  String Description;
  String Location;
  
  
  Uri PictureUri;
  int NumVolunteersNeeded;
  int NumVolunteersRegistered;
  DateTime CreateDate;
  DateTime EventDate;
  DateTime LastUpdateDate;
  
  String OwnerId;
  
  public Event() {
  
  }
  
  public void Edit() {
  }
  
  public void Delete() {
  }
  
  public bool Register(String volunteerId) {
  }
  
  public bool Unregister(String volunteerId) {
  }
  
  public ArrayList<String> GetVolunteerRoster() {
  }
  
  public String ToString() {
  }
}
