# ViewPager2 테스트

## ViewPager1과 ViewPager2의 차이점

1.  현재의 ViewPager2는 Android X 용으로 출시되어서 사용하려면 프로젝트가 Android X로 마이그레이션 되어야 한다.
    <br><br>ex. implementation 'androidx.viewpager2:viewpager2:1.0.0-alpha01'
  <br><br><br>
2. ViewPager2에서는 RecyclerView.Adapter가 PagerAdapter를 대체한다. 
   <br><br>(RecyclerView를 알면 ViewPager공부를 따로 할 필요 없이 사용가능하다)
<br><br><br>
3. FragmentStateAdapter를 이용하여 프레그먼트 구성을한다. 기존 ViewPager1의 FragmentStatePagerAdapter을 대체한다.
    <br><br>ex1. pager.adapter = PagerFragmentStateAdapter(bgColors, supportFragmentManager)
    <br>ex2. pager.orientation = ViewPager2.ORIENTATION_VERTICAL
    <br><br><br>
4. OnPageChangeCallback 기존 ViewPager1의 addPageChangeListener는 인터페이스여서 Method를 모두 재정의해야 했다. 
   <br><br>하지만 ViewPager2의 OnPageChangeCallback은 추상 클래스이다. 다시말해 수정 및 추가가 자유롭다. 
   
   
