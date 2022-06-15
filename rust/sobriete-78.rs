pub mod erase_mod {
    pub fn erase(st: &String) -> String {
        let mut s = String::new();
        let size = st.len();
        let mut i = 0;
        while i < size {
            if &st[i..i+1] == " " {
                let mut cpt = 1;
                while i+cpt < size && &st[i+cpt..i+cpt+1] == " " {
                    cpt+=1;
                }
                if cpt != 1 {
                    s.push_str(&st[i..i+cpt]);
                    i+=cpt-1;
                }
            }else {
                s.push_str(&st[i..i+1]);
            }
            i+=1;
        }
        s
    }
}