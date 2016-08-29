import java.util.ArrayList;

class RootModel {

	public String description;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String email;
	public CreatorModel _creator;
	public String schedule_published_on;
	public int id;
	public String organizer_description;
	public String privacy;
	public String state;
	public String code_of_conduct;
	public String type;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String location_name;
	public String timezone;
	public VersionModel _version;
	public String organizer_name;
	public String start_time;
	public CopyrightModel _copyright;
	public String topic;
	public String logo;

	public RootModel(String description, Call_for_papersModel call_for_papers, String background_image, String email, CreatorModel creator, String schedule_published_on, int id, String organizer_description, String privacy, String state, String code_of_conduct, String type, String end_time, ArrayList<Social_linksModel> social_links, String name, String location_name, String timezone, VersionModel version, String organizer_name, String start_time, CopyrightModel copyright, String topic, String logo) {

		this.description = description;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.email = email;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.end_time = end_time;
		this.social_links = social_links;
		this.name = name;
		this.location_name = location_name;
		this.timezone = timezone;
		this._version = version;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._copyright = copyright;
		this.topic = topic;
		this.logo = logo;

	}

}