import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String organizer_name;
	public String code_of_conduct;
	public String email;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String type;
	public VersionModel _version;
	public String topic;
	public String logo;
	public String start_time;
	public String schedule_published_on;
	public String background_image;
	public String description;
	public String location_name;
	public String timezone;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String state;

	public RootModel(String organizer_description, String organizer_name, String code_of_conduct, String email, CreatorModel creator, CopyrightModel copyright, int id, Call_for_papersModel call_for_papers, String name, String type, VersionModel version, String topic, String logo, String start_time, String schedule_published_on, String background_image, String description, String location_name, String timezone, String end_time, ArrayList<Social_linksModel> social_links, String privacy, String state) {

		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this._creator = creator;
		this._copyright = copyright;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.type = type;
		this._version = version;
		this.topic = topic;
		this.logo = logo;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.description = description;
		this.location_name = location_name;
		this.timezone = timezone;
		this.end_time = end_time;
		this.social_links = social_links;
		this.privacy = privacy;
		this.state = state;

	}

}