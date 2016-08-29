import java.util.ArrayList;

class RootModel {

	public String description;
	public String location_name;
	public String organizer_description;
	public String type;
	public VersionModel _version;
	public String logo;
	public String schedule_published_on;
	public String topic;
	public String timezone;
	public CopyrightModel _copyright;
	public String organizer_name;
	public CreatorModel _creator;
	public String privacy;
	public String name;
	public String code_of_conduct;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String email;
	public int id;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String state;

	public RootModel(String description, String location_name, String organizer_description, String type, VersionModel version, String logo, String schedule_published_on, String topic, String timezone, CopyrightModel copyright, String organizer_name, CreatorModel creator, String privacy, String name, String code_of_conduct, String start_time, Call_for_papersModel call_for_papers, String end_time, String email, int id, String background_image, ArrayList<Social_linksModel> social_links, String state) {

		this.description = description;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.type = type;
		this._version = version;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.timezone = timezone;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.privacy = privacy;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.email = email;
		this.id = id;
		this.background_image = background_image;
		this.social_links = social_links;
		this.state = state;

	}

}