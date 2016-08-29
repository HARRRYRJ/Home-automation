import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String location_name;
	public String start_time;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String end_time;
	public String topic;
	public String code_of_conduct;
	public String description;
	public String name;
	public String background_image;
	public String logo;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String organizer_description;
	public String organizer_name;
	public String privacy;
	public String type;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String state;

	public RootModel(String timezone, String location_name, String start_time, String schedule_published_on, CreatorModel creator, String end_time, String topic, String code_of_conduct, String description, String name, String background_image, String logo, int id, Call_for_papersModel call_for_papers, String email, String organizer_description, String organizer_name, String privacy, String type, CopyrightModel copyright, VersionModel version, ArrayList<Social_linksModel> social_links, String state) {

		this.timezone = timezone;
		this.location_name = location_name;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.end_time = end_time;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.name = name;
		this.background_image = background_image;
		this.logo = logo;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.type = type;
		this._copyright = copyright;
		this._version = version;
		this.social_links = social_links;
		this.state = state;

	}

}