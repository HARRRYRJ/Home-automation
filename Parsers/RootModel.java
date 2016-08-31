import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String name;
	public String end_time;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String description;
	public String organizer_name;
	public String privacy;
	public String timezone;
	public String start_time;
	public String background_image;
	public String location_name;
	public String schedule_published_on;
	public VersionModel _version;
	public String logo;
	public int id;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String topic;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String state;

	public RootModel(String organizer_description, String name, String end_time, String type, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String description, String organizer_name, String privacy, String timezone, String start_time, String background_image, String location_name, String schedule_published_on, VersionModel version, String logo, int id, String code_of_conduct, CreatorModel creator, String topic, String email, Call_for_papersModel call_for_papers, String state) {

		this.organizer_description = organizer_description;
		this.name = name;
		this.end_time = end_time;
		this.type = type;
		this.social_links = social_links;
		this._copyright = copyright;
		this.description = description;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.timezone = timezone;
		this.start_time = start_time;
		this.background_image = background_image;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.logo = logo;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.topic = topic;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.state = state;

	}

}