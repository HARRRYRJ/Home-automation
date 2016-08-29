import java.util.ArrayList;

class RootModel {

	public String timezone;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String schedule_published_on;
	public String email;
	public String background_image;
	public String type;
	public String topic;
	public String privacy;
	public String name;
	public String description;
	public String start_time;
	public String location_name;
	public int id;
	public String organizer_name;
	public VersionModel _version;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String code_of_conduct;
	public String state;

	public RootModel(String timezone, CopyrightModel copyright, CreatorModel creator, ArrayList<Social_linksModel> social_links, String logo, String schedule_published_on, String email, String background_image, String type, String topic, String privacy, String name, String description, String start_time, String location_name, int id, String organizer_name, VersionModel version, String end_time, Call_for_papersModel call_for_papers, String organizer_description, String code_of_conduct, String state) {

		this.timezone = timezone;
		this._copyright = copyright;
		this._creator = creator;
		this.social_links = social_links;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.background_image = background_image;
		this.type = type;
		this.topic = topic;
		this.privacy = privacy;
		this.name = name;
		this.description = description;
		this.start_time = start_time;
		this.location_name = location_name;
		this.id = id;
		this.organizer_name = organizer_name;
		this._version = version;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.state = state;

	}

}