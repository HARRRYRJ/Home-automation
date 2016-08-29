import java.util.ArrayList;

class RootModel {

	public int id;
	public String state;
	public String location_name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String start_time;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String privacy;
	public String topic;
	public String end_time;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String background_image;
	public String timezone;
	public String organizer_name;
	public String logo;
	public String name;
	public String schedule_published_on;

	public RootModel(int id, String state, String location_name, CreatorModel creator, String code_of_conduct, Call_for_papersModel call_for_papers, String type, String start_time, VersionModel version, CopyrightModel copyright, String organizer_description, String privacy, String topic, String end_time, String email, ArrayList<Social_linksModel> social_links, String description, String background_image, String timezone, String organizer_name, String logo, String name, String schedule_published_on) {

		this.id = id;
		this.state = state;
		this.location_name = location_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.start_time = start_time;
		this._version = version;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.topic = topic;
		this.end_time = end_time;
		this.email = email;
		this.social_links = social_links;
		this.description = description;
		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.name = name;
		this.schedule_published_on = schedule_published_on;

	}

}