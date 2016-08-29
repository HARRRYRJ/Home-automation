import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String timezone;
	public VersionModel _version;
	public String start_time;
	public String code_of_conduct;
	public String description;
	public String topic;
	public String schedule_published_on;
	public String name;
	public String logo;
	public String organizer_description;
	public String background_image;
	public String location_name;
	public CopyrightModel _copyright;
	public String state;
	public String end_time;
	public String type;
	public String organizer_name;
	public String privacy;
	public int id;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;

	public RootModel(CreatorModel creator, String timezone, VersionModel version, String start_time, String code_of_conduct, String description, String topic, String schedule_published_on, String name, String logo, String organizer_description, String background_image, String location_name, CopyrightModel copyright, String state, String end_time, String type, String organizer_name, String privacy, int id, String email, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers) {

		this._creator = creator;
		this.timezone = timezone;
		this._version = version;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.location_name = location_name;
		this._copyright = copyright;
		this.state = state;
		this.end_time = end_time;
		this.type = type;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.id = id;
		this.email = email;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;

	}

}