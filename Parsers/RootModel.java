import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String end_time;
	public String organizer_description;
	public String organizer_name;
	public int id;
	public String name;
	public String start_time;
	public String code_of_conduct;
	public String email;
	public String schedule_published_on;
	public String topic;
	public String timezone;
	public String state;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String type;
	public String privacy;
	public String description;
	public String logo;
	public String location_name;
	public Call_for_papersModel _call_for_papers;

	public RootModel(CreatorModel creator, String end_time, String organizer_description, String organizer_name, int id, String name, String start_time, String code_of_conduct, String email, String schedule_published_on, String topic, String timezone, String state, CopyrightModel copyright, VersionModel version, ArrayList<Social_linksModel> social_links, String background_image, String type, String privacy, String description, String logo, String location_name, Call_for_papersModel call_for_papers) {

		this._creator = creator;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.id = id;
		this.name = name;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.timezone = timezone;
		this.state = state;
		this._copyright = copyright;
		this._version = version;
		this.social_links = social_links;
		this.background_image = background_image;
		this.type = type;
		this.privacy = privacy;
		this.description = description;
		this.logo = logo;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;

	}

}