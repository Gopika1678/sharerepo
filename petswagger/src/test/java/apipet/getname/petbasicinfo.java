package apipet.getname;


public class petbasicinfo {
	String Id;
	String Name;
	String PhotoUrl;
	String Status;
	//postreqpet Category;
	postreqpet Category;
	postreqtags Tags;
	public postreqpet getCategory() {
		return Category;
	}
	public void setCategory(postreqpet category) {
		Category = category;
	}

	public postreqtags getTags() {
		return Tags;
	}
	public void setTags(postreqtags tags) {
		Tags = tags;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhotoUrl() {
		return PhotoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		PhotoUrl = photoUrl;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
}
