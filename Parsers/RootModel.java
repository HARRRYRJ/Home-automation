import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String code_of_conduct;
	public String state;
	public String end_time;
	public int id;
	public String topic;
	public CopyrightModel _copyright;
	public String type;
	public String email;
	public String description;
	public String start_time;
	public String organizer_name;
	public VersionModel _version;
	public String background_image;
	public String timezone;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String location_name;
	public String privacy;

	public RootModel(String organizer_description, String logo, ArrayList<Social_linksModel> social_links, String name, String code_of_conduct, String state, String end_time, int id, String topic, CopyrightModel copyright, String type, String email, String description, String start_time, String organizer_name, VersionModel version, String background_image, String timezone, String schedule_published_on, Call_for_papersModel call_for_papers, CreatorModel creator, String location_name, String privacy) {

		this.organizer_description = organizer_description;
		this.logo = logo;
		this.social_links = social_links;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.end_time = end_time;
		this.id = id;
		this.topic = topic;
		this._copyright = copyright;
		this.type = type;
		this.email = email;
		this.description = description;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._version = version;
		this.background_image = background_image;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.location_name = location_name;
		this.privacy = privacy;

	}

}