import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String privacy;
	public String start_time;
	public String description;
	public String organizer_name;
	public String background_image;
	public String state;
	public String location_name;
	public String logo;
	public String email;
	public String end_time;
	public VersionModel _version;
	public String name;
	public int id;
	public String type;
	public String timezone;

	public RootModel(CreatorModel creator, String topic, Call_for_papersModel call_for_papers, String organizer_description, String code_of_conduct, ArrayList<Social_linksModel> social_links, String schedule_published_on, CopyrightModel copyright, String privacy, String start_time, String description, String organizer_name, String background_image, String state, String location_name, String logo, String email, String end_time, VersionModel version, String name, int id, String type, String timezone) {

		this._creator = creator;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.privacy = privacy;
		this.start_time = start_time;
		this.description = description;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.state = state;
		this.location_name = location_name;
		this.logo = logo;
		this.email = email;
		this.end_time = end_time;
		this._version = version;
		this.name = name;
		this.id = id;
		this.type = type;
		this.timezone = timezone;

	}

}