// 981. Time Based Key-Value Store

class TimeMap {
    HashMap<String, TreeMap<Integer, String>> timeMap;
    public TimeMap() {
        this.timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> timeValue;
        if (this.timeMap.containsKey(key)) {
            timeValue = this.timeMap.get(key);
        } else {
            timeValue = new TreeMap<>();
        }
        timeValue.put(timestamp, value);
        this.timeMap.put(key, timeValue);
    }
    
    public String get(String key, int timestamp) {
        if (this.timeMap.containsKey(key)) {
            if (this.timeMap.get(key).floorEntry(timestamp) != null) {
                return this.timeMap.get(key).floorEntry(timestamp).getValue();
            }
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
