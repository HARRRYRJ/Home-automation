import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String end_time;
	public int id;
	public String description;
	public String type;
	public String background_image;
	public String timezone;
	public String start_time;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String topic;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String name;
	public String code_of_conduct;
	public String email;
	public String logo;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String organizer_description;
	public String location_name;

	public RootModel(CreatorModel creator, String end_time, int id, String description, String type, String background_image, String timezone, String start_time, String privacy, ArrayList<Social_linksModel> social_links, String organizer_name, String topic, String schedule_published_on, Call_for_papersModel call_for_papers, String state, String name, String code_of_conduct, String email, String logo, CopyrightModel copyright, VersionModel version, String organizer_description, String location_name) {

		this._creator = creator;
		this.end_time = end_time;
		this.id = id;
		this.description = description;
		this.type = type;
		this.background_image = background_image;
		this.timezone = timezone;
		this.start_time = start_time;
		this.privacy = privacy;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.logo = logo;
		this._copyright = copyright;
		this._version = version;
		this.organizer_description = organizer_description;
		this.location_name = location_name;

	}

}