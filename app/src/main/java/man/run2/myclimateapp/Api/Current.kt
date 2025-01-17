package man.run2.myclimateapp.Api

data class Current(
    var cloud: String,
    var condition: String,
    var dewpoint_c: String,
    var dewpoint_f: String,
    var feelslike_c: String,
    var feelslike_f: String,
    var gust_kph: String,
    var gust_mph: String,
    var heatindex_c: String,
    var heatindex_f: String,
    var humidity: String,
    var is_day: String,
    var last_updated: String,
    var last_updated_epoch: String,
    var precip_in: String,
    var precip_mm: String,
    var pressure_in: String,
    var pressure_mb: String,
    var temp_c: String,
    var temp_f: String,
    var uv: String,
    var vis_km: String,
    var vis_miles: String,
    var wind_degree: String,
    var wind_dir: String,
    var wind_kph: String,
    var wind_mph: String,
    var windchill_c: String,
    var windchill_f: String
)