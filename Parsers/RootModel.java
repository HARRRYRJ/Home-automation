import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String email;
	public int id;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String description;
	public String start_time;
	public String topic;
	public String code_of_conduct;
	public String schedule_published_on;
	public String state;
	public String timezone;
	public String location_name;
	public VersionModel _version;
	public String type;
	public String end_time;
	public String privacy;
	public String logo;
	public String organizer_name;
	public String name;
	public String organizer_description;

	public RootModel(ArrayList<Social_linksModel> social_links, String email, int id, CreatorModel creator, CopyrightModel copyright, Call_for_papersModel call_for_papers, String background_image, String description, String start_time, String topic, String code_of_conduct, String schedule_published_on, String state, String timezone, String location_name, VersionModel version, String type, String end_time, String privacy, String logo, String organizer_name, String name, String organizer_description) {

		this.social_links = social_links;
		this.email = email;
		this.id = id;
		this._creator = creator;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.description = description;
		this.start_time = start_time;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.timezone = timezone;
		this.location_name = location_name;
		this._version = version;
		this.type = type;
		this.end_time = end_time;
		this.privacy = privacy;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.name = name;
		this.organizer_description = organizer_description;

	}

}