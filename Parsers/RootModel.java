import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String state;
	public String end_time;
	public String email;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String code_of_conduct;
	public String schedule_published_on;
	public String start_time;
	public int id;
	public String timezone;
	public String type;
	public String organizer_description;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String location_name;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String topic;
	public String logo;

	public RootModel(VersionModel version, String state, String end_time, String email, String background_image, Call_for_papersModel call_for_papers, String name, String code_of_conduct, String schedule_published_on, String start_time, int id, String timezone, String type, String organizer_description, CreatorModel creator, CopyrightModel copyright, String organizer_name, String location_name, String privacy, ArrayList<Social_linksModel> social_links, String description, String topic, String logo) {

		this._version = version;
		this.state = state;
		this.end_time = end_time;
		this.email = email;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.id = id;
		this.timezone = timezone;
		this.type = type;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.privacy = privacy;
		this.social_links = social_links;
		this.description = description;
		this.topic = topic;
		this.logo = logo;

	}

}