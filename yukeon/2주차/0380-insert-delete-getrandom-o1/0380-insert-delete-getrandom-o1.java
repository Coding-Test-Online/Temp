class RandomizedSet {
    private HashSet<Integer> set;
    Random random;

    public RandomizedSet() {
        this.set = new HashSet();
        this.random = new Random();
    }

    public boolean insert(int val) {
        if (set.contains(val)) return false;
        set.add(val);
        return true;
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        int idx = random.nextInt(set.size());
        ArrayList<Integer> list = new ArrayList<>(set);
        return list.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */