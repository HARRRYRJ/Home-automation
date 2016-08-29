import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String organizer_name;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String start_time;
	public String email;
	public String name;
	public int id;
	public String background_image;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String location_name;
	public VersionModel _version;
	public String timezone;
	public String schedule_published_on;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String description;
	public String topic;
	public String state;

	public RootModel(String privacy, String organizer_name, String code_of_conduct, CopyrightModel copyright, CreatorModel creator, String start_time, String email, String name, int id, String background_image, String end_time, Call_for_papersModel call_for_papers, String type, String location_name, VersionModel version, String timezone, String schedule_published_on, String logo, ArrayList<Social_linksModel> social_links, String organizer_description, String description, String topic, String state) {

		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._creator = creator;
		this.start_time = start_time;
		this.email = email;
		this.name = name;
		this.id = id;
		this.background_image = background_image;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.location_name = location_name;
		this._version = version;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.description = description;
		this.topic = topic;
		this.state = state;

	}

}