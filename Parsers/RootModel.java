import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String state;
	public String end_time;
	public String topic;
	public String organizer_name;
	public String schedule_published_on;
	public String email;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String name;
	public String location_name;
	public String start_time;
	public String type;
	public String organizer_description;
	public int id;
	public String code_of_conduct;
	public String timezone;
	public String logo;
	public String background_image;
	public VersionModel _version;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(CopyrightModel copyright, String state, String end_time, String topic, String organizer_name, String schedule_published_on, String email, String privacy, Call_for_papersModel call_for_papers, String description, String name, String location_name, String start_time, String type, String organizer_description, int id, String code_of_conduct, String timezone, String logo, String background_image, VersionModel version, CreatorModel creator, ArrayList<Social_linksModel> social_links) {

		this._copyright = copyright;
		this.state = state;
		this.end_time = end_time;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.name = name;
		this.location_name = location_name;
		this.start_time = start_time;
		this.type = type;
		this.organizer_description = organizer_description;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.logo = logo;
		this.background_image = background_image;
		this._version = version;
		this._creator = creator;
		this.social_links = social_links;

	}

}