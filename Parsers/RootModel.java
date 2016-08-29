import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String location_name;
	public String start_time;
	public int id;
	public VersionModel _version;
	public String email;
	public String logo;
	public String topic;
	public String timezone;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String state;
	public String type;
	public String name;
	public String code_of_conduct;
	public String organizer_name;
	public String end_time;
	public String privacy;
	public String organizer_description;
	public String schedule_published_on;

	public RootModel(CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String background_image, String location_name, String start_time, int id, VersionModel version, String email, String logo, String topic, String timezone, CreatorModel creator, Call_for_papersModel call_for_papers, String description, String state, String type, String name, String code_of_conduct, String organizer_name, String end_time, String privacy, String organizer_description, String schedule_published_on) {

		this._copyright = copyright;
		this.social_links = social_links;
		this.background_image = background_image;
		this.location_name = location_name;
		this.start_time = start_time;
		this.id = id;
		this._version = version;
		this.email = email;
		this.logo = logo;
		this.topic = topic;
		this.timezone = timezone;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.state = state;
		this.type = type;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;

	}

}