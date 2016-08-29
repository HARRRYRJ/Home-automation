import java.util.ArrayList;

class RootModel {

	public String description;
	public CreatorModel _creator;
	public String background_image;
	public String logo;
	public String code_of_conduct;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public int id;
	public String type;
	public String name;
	public String organizer_description;
	public String start_time;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public VersionModel _version;
	public String email;
	public String location_name;
	public CopyrightModel _copyright;
	public String timezone;
	public String organizer_name;
	public String privacy;

	public RootModel(String description, CreatorModel creator, String background_image, String logo, String code_of_conduct, String end_time, ArrayList<Social_linksModel> social_links, String topic, int id, String type, String name, String organizer_description, String start_time, String schedule_published_on, Call_for_papersModel call_for_papers, String state, VersionModel version, String email, String location_name, CopyrightModel copyright, String timezone, String organizer_name, String privacy) {

		this.description = description;
		this._creator = creator;
		this.background_image = background_image;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.social_links = social_links;
		this.topic = topic;
		this.id = id;
		this.type = type;
		this.name = name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this._version = version;
		this.email = email;
		this.location_name = location_name;
		this._copyright = copyright;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.privacy = privacy;

	}

}