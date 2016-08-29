import java.util.ArrayList;

class RootModel {

	public String topic;
	public String name;
	public String logo;
	public String type;
	public String end_time;
	public String state;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String schedule_published_on;
	public String code_of_conduct;
	public String description;
	public String email;
	public String start_time;
	public String background_image;
	public CopyrightModel _copyright;
	public String timezone;
	public String organizer_description;
	public String location_name;
	public VersionModel _version;
	public String privacy;

	public RootModel(String topic, String name, String logo, String type, String end_time, String state, String organizer_name, Call_for_papersModel call_for_papers, CreatorModel creator, ArrayList<Social_linksModel> social_links, int id, String schedule_published_on, String code_of_conduct, String description, String email, String start_time, String background_image, CopyrightModel copyright, String timezone, String organizer_description, String location_name, VersionModel version, String privacy) {

		this.topic = topic;
		this.name = name;
		this.logo = logo;
		this.type = type;
		this.end_time = end_time;
		this.state = state;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.social_links = social_links;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.email = email;
		this.start_time = start_time;
		this.background_image = background_image;
		this._copyright = copyright;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._version = version;
		this.privacy = privacy;

	}

}