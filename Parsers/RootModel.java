import java.util.ArrayList;

class RootModel {

	public String description;
	public CopyrightModel _copyright;
	public String email;
	public String end_time;
	public String schedule_published_on;
	public String code_of_conduct;
	public String organizer_name;
	public String start_time;
	public String privacy;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public VersionModel _version;
	public String location_name;
	public String timezone;
	public String state;
	public String type;
	public String organizer_description;
	public String background_image;
	public String name;
	public int id;
	public String logo;

	public RootModel(String description, CopyrightModel copyright, String email, String end_time, String schedule_published_on, String code_of_conduct, String organizer_name, String start_time, String privacy, CreatorModel creator, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String topic, VersionModel version, String location_name, String timezone, String state, String type, String organizer_description, String background_image, String name, int id, String logo) {

		this.description = description;
		this._copyright = copyright;
		this.email = email;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.privacy = privacy;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.topic = topic;
		this._version = version;
		this.location_name = location_name;
		this.timezone = timezone;
		this.state = state;
		this.type = type;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.name = name;
		this.id = id;
		this.logo = logo;

	}

}