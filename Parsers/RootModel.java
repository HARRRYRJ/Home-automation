import java.util.ArrayList;

class RootModel {

	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public CopyrightModel _copyright;
	public String name;
	public String start_time;
	public String type;
	public String schedule_published_on;
	public int id;
	public String background_image;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String state;
	public VersionModel _version;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String end_time;
	public String description;
	public String location_name;
	public String topic;
	public String timezone;
	public String logo;

	public RootModel(String privacy, Call_for_papersModel call_for_papers, String email, CopyrightModel copyright, String name, String start_time, String type, String schedule_published_on, int id, String background_image, String organizer_name, ArrayList<Social_linksModel> social_links, String organizer_description, String state, VersionModel version, String code_of_conduct, CreatorModel creator, String end_time, String description, String location_name, String topic, String timezone, String logo) {

		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this._copyright = copyright;
		this.name = name;
		this.start_time = start_time;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.state = state;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.end_time = end_time;
		this.description = description;
		this.location_name = location_name;
		this.topic = topic;
		this.timezone = timezone;
		this.logo = logo;

	}

}