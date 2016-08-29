import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String privacy;
	public VersionModel _version;
	public String organizer_name;
	public int id;
	public CreatorModel _creator;
	public String description;
	public String logo;
	public String start_time;
	public String topic;
	public String type;
	public String state;
	public String location_name;
	public String code_of_conduct;
	public String end_time;
	public String email;
	public String timezone;
	public String organizer_description;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public CopyrightModel _copyright;

	public RootModel(ArrayList<Social_linksModel> social_links, String background_image, String privacy, VersionModel version, String organizer_name, int id, CreatorModel creator, String description, String logo, String start_time, String topic, String type, String state, String location_name, String code_of_conduct, String end_time, String email, String timezone, String organizer_description, String schedule_published_on, Call_for_papersModel call_for_papers, String name, CopyrightModel copyright) {

		this.social_links = social_links;
		this.background_image = background_image;
		this.privacy = privacy;
		this._version = version;
		this.organizer_name = organizer_name;
		this.id = id;
		this._creator = creator;
		this.description = description;
		this.logo = logo;
		this.start_time = start_time;
		this.topic = topic;
		this.type = type;
		this.state = state;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.email = email;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this._copyright = copyright;

	}

}