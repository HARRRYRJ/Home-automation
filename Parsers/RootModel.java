import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String end_time;
	public String type;
	public CopyrightModel _copyright;
	public String privacy;
	public String email;
	public int id;
	public String logo;
	public VersionModel _version;
	public String schedule_published_on;
	public String state;
	public String background_image;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String description;
	public String organizer_description;
	public String location_name;
	public String name;
	public String organizer_name;

	public RootModel(Call_for_papersModel call_for_papers, String topic, String code_of_conduct, CreatorModel creator, String end_time, String type, CopyrightModel copyright, String privacy, String email, int id, String logo, VersionModel version, String schedule_published_on, String state, String background_image, String start_time, ArrayList<Social_linksModel> social_links, String timezone, String description, String organizer_description, String location_name, String name, String organizer_name) {

		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.end_time = end_time;
		this.type = type;
		this._copyright = copyright;
		this.privacy = privacy;
		this.email = email;
		this.id = id;
		this.logo = logo;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.background_image = background_image;
		this.start_time = start_time;
		this.social_links = social_links;
		this.timezone = timezone;
		this.description = description;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.name = name;
		this.organizer_name = organizer_name;

	}

}