import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String email;
	public String topic;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String type;
	public String code_of_conduct;
	public String description;
	public CopyrightModel _copyright;
	public String location_name;
	public String logo;
	public String organizer_description;
	public int id;
	public String background_image;
	public String end_time;
	public VersionModel _version;
	public String state;
	public CreatorModel _creator;
	public String start_time;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;

	public RootModel(String timezone, String email, String topic, String schedule_published_on, Call_for_papersModel call_for_papers, String name, String type, String code_of_conduct, String description, CopyrightModel copyright, String location_name, String logo, String organizer_description, int id, String background_image, String end_time, VersionModel version, String state, CreatorModel creator, String start_time, String organizer_name, ArrayList<Social_linksModel> social_links, String privacy) {

		this.timezone = timezone;
		this.email = email;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this._copyright = copyright;
		this.location_name = location_name;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.id = id;
		this.background_image = background_image;
		this.end_time = end_time;
		this._version = version;
		this.state = state;
		this._creator = creator;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.privacy = privacy;

	}

}