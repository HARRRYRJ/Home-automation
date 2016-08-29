import java.util.ArrayList;

class RootModel {

	public String logo;
	public String organizer_name;
	public String email;
	public String privacy;
	public String location_name;
	public String background_image;
	public VersionModel _version;
	public CreatorModel _creator;
	public String organizer_description;
	public String topic;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public int id;
	public String end_time;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String schedule_published_on;
	public String timezone;
	public String state;

	public RootModel(String logo, String organizer_name, String email, String privacy, String location_name, String background_image, VersionModel version, CreatorModel creator, String organizer_description, String topic, String type, ArrayList<Social_linksModel> social_links, String name, int id, String end_time, CopyrightModel copyright, String code_of_conduct, String description, Call_for_papersModel call_for_papers, String start_time, String schedule_published_on, String timezone, String state) {

		this.logo = logo;
		this.organizer_name = organizer_name;
		this.email = email;
		this.privacy = privacy;
		this.location_name = location_name;
		this.background_image = background_image;
		this._version = version;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.type = type;
		this.social_links = social_links;
		this.name = name;
		this.id = id;
		this.end_time = end_time;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.state = state;

	}

}