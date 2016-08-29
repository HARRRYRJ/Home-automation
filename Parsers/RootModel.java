import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String name;
	public int id;
	public String location_name;
	public String email;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String type;
	public String timezone;
	public String logo;
	public String organizer_name;
	public String topic;
	public String background_image;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String end_time;
	public String organizer_description;
	public CreatorModel _creator;
	public String privacy;

	public RootModel(String code_of_conduct, String name, int id, String location_name, String email, String schedule_published_on, CopyrightModel copyright, VersionModel version, String type, String timezone, String logo, String organizer_name, String topic, String background_image, String state, Call_for_papersModel call_for_papers, String start_time, ArrayList<Social_linksModel> social_links, String description, String end_time, String organizer_description, CreatorModel creator, String privacy) {

		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.id = id;
		this.location_name = location_name;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._version = version;
		this.type = type;
		this.timezone = timezone;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.background_image = background_image;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.social_links = social_links;
		this.description = description;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.privacy = privacy;

	}

}