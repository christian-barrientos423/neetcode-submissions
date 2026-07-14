class TimeMap {

HashMap<String, TreeMap<Integer, String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) {
            map.get(key).put(timestamp, value);
        } else {
            TreeMap<Integer,String> timestampMap = new TreeMap<>();
            timestampMap.put(timestamp, value);
            map.put(key, timestampMap);
        }
        
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)) {
            List<Integer> sortedKeys =  new ArrayList<>(map.get(key).keySet());
            int start = 0;
            int end = sortedKeys.size()-1;
            int closest = -1;
            while(start <= end) {
                int mid = (start + end) / 2;
                int midValue = sortedKeys.get(mid);
                if (midValue == timestamp) {
                    return map.get(key).get(timestamp);
                }
            
                if (midValue < timestamp) {
                    closest = midValue;
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            if (closest == -1) {
                return "";
            } else {
                return map.get(key).get(closest);
            }
        } else {
            return "";
        }
    }
}
