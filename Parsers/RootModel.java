import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String privacy;
	public CreatorModel _creator;
	public String email;
	public String topic;
	public CopyrightModel _copyright;
	public String location_name;
	public String end_time;
	public int id;
	public String timezone;
	public String code_of_conduct;
	public String type;
	public String organizer_description;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String state;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String background_image;
	public VersionModel _version;
	public String logo;

	public RootModel(String organizer_name, String privacy, CreatorModel creator, String email, String topic, CopyrightModel copyright, String location_name, String end_time, int id, String timezone, String code_of_conduct, String type, String organizer_description, String start_time, ArrayList<Social_linksModel> social_links, String name, String state, String description, Call_for_papersModel call_for_papers, String schedule_published_on, String background_image, VersionModel version, String logo) {

		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._creator = creator;
		this.email = email;
		this.topic = topic;
		this._copyright = copyright;
		this.location_name = location_name;
		this.end_time = end_time;
		this.id = id;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.social_links = social_links;
		this.name = name;
		this.state = state;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this._version = version;
		this.logo = logo;

	}

}