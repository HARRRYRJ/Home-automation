import java.util.ArrayList;

class RootModel {

	public String background_image;
	public VersionModel _version;
	public String description;
	public String organizer_name;
	public String location_name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String privacy;
	public CopyrightModel _copyright;
	public String topic;
	public String organizer_description;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String name;
	public String type;
	public String state;
	public String email;
	public String end_time;
	public String schedule_published_on;
	public String start_time;
	public String logo;

	public RootModel(String background_image, VersionModel version, String description, String organizer_name, String location_name, int id, ArrayList<Social_linksModel> social_links, String timezone, String privacy, CopyrightModel copyright, String topic, String organizer_description, String code_of_conduct, Call_for_papersModel call_for_papers, CreatorModel creator, String name, String type, String state, String email, String end_time, String schedule_published_on, String start_time, String logo) {

		this.background_image = background_image;
		this._version = version;
		this.description = description;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.id = id;
		this.social_links = social_links;
		this.timezone = timezone;
		this.privacy = privacy;
		this._copyright = copyright;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.name = name;
		this.type = type;
		this.state = state;
		this.email = email;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.logo = logo;

	}

}