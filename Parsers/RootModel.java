import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String email;
	public CopyrightModel _copyright;
	public String type;
	public VersionModel _version;
	public String state;
	public String organizer_name;
	public String privacy;
	public CreatorModel _creator;
	public String logo;
	public String timezone;
	public String code_of_conduct;
	public String start_time;
	public String name;
	public String organizer_description;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String location_name;
	public String topic;
	public String background_image;
	public String schedule_published_on;
	public String description;

	public RootModel(Call_for_papersModel call_for_papers, String email, CopyrightModel copyright, String type, VersionModel version, String state, String organizer_name, String privacy, CreatorModel creator, String logo, String timezone, String code_of_conduct, String start_time, String name, String organizer_description, String end_time, ArrayList<Social_linksModel> social_links, int id, String location_name, String topic, String background_image, String schedule_published_on, String description) {

		this._call_for_papers = call_for_papers;
		this.email = email;
		this._copyright = copyright;
		this.type = type;
		this._version = version;
		this.state = state;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._creator = creator;
		this.logo = logo;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.name = name;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.social_links = social_links;
		this.id = id;
		this.location_name = location_name;
		this.topic = topic;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.description = description;

	}

}