package com.android.dmarketclonecoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.dmarketclonecoding.databinding.ActivityMainBinding

//https://teamsparta.notion.site/Android-de05cc5f0d054de9964f8ad1f116b784
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 데이터 원본 준비
        val dataList = mutableListOf<MyItem>()
        dataList.add(MyItem(R.drawable.sample1, "산지 한달된 선풍기 팝니다", "서울 서대문구 창천동", 1000))
        dataList.add(MyItem(R.drawable.sample2, "김치냉장고", "인천 계양구 귤현동",20000))
        dataList.add(MyItem(R.drawable.sample3, "샤넬 카드지갑", "고퀄지갑이구요 사용감이 있어서 싸게 내어둡니다",10000))
        dataList.add(MyItem(R.drawable.sample4, "금고", "금고 떼서 가져가야함 대우월드마크센텀 미국이주관계로 싸게 팝니다", 10000))
        dataList.add(MyItem(R.drawable.sample5, "갤럭시Z플립3 팝니다", "갤럭시 Z플립3 그린 팝니다 항시 케이스 씌워서 썻고 필름 한장챙겨드립니다 화면에 살짝 스크래치난거 말고 크게 이상은없습니다!",150000))
        dataList.add(MyItem(R.drawable.sample6, "프라다 복조리백", "까임 오염없고 상태 깨끗합니다 정품여부모름",50000))
        dataList.add(MyItem(R.drawable.sample7, "울산 동해오션뷰 60평 복층 펜트하우스 1일 숙박권 펜션 힐링 숙소 별장", "울산 동해바다뷰 60평 복층 펜트하우스 1일 숙박권(에어컨이 없기에 낮은 가격으로 변경했으며 8월 초 가장 더운날 다녀가신 분 경우 시원했다고 잘 지내다 가셨습니다) 1. 인원: 6명 기준입니다. 1인 10,000원 추가요금 2. 장소: 북구 블루마시티, 32-33층 3. 취사도구, 침구류, 세면도구, 드라이기 2개, 선풍기 4대 구비 4. 예약방법: 예약금 50,000원 하시면 저희는 명함을 드리며 입실 오전 잔금 입금하시면 저희는 동.호수를 알려드리며 고객님은 예약자분 신분증 앞면 주민번호 뒷자리 가리시거나 지우시고 문자로 보내주시면 저희는 카드키를 우편함에 놓아 둡니다. 5. 33층 옥상 야외 테라스 있음, 가스버너 있음 6. 고기 굽기 가능 7. 입실 오후 3시, 오전 11시 퇴실, 정리, 정돈 , 밸브 잠금 부탁드립니다. 8. 층간소음 주의 부탁드립니다. 9. 방3개, 화장실3개, 비데 3개 10. 저희 집안이 쓰는 별장입니다.", 150000))
        dataList.add(MyItem(R.drawable.sample8, "샤넬 탑핸들 가방", "샤넬 트랜디 CC 탑핸들 스몰 램스킨 블랙 금장 플랩백 ! + 색상 : 블랙 + 사이즈 : 25.5cm * 17.5cm * 8cm + 구성 : 본품더스트 +  + 급하게 돈이 필요해서 팝니다 ㅠ ㅠ",180000))
        dataList.add(MyItem(R.drawable.sample9, "4행정 엔진분무기 판매합니다.", "3년전에 사서 한번 사용하고 그대로 둔 상태입니다. 요즘 사용은 안해봤습니다. 그래서 저렴하게 내 놓습니다. 중고라 반품은 어렵습니다.\\n",30000))
        dataList.add(MyItem(R.drawable.sample10, "셀린느 버킷 가방", "22년 신세계 대전 구매입니당\\n + \"셀린느 버킷백\\n\" + \"구매해서 몇번사용했어요\\n\" + \"까짐 스크래치 없습니다.\\n\" + \"타지역에서 보내는거라 택배로 진행합니당!\"",190000))



        // 어댑터 생성 및 연결
        binding.listView.adapter = Adapter(this, dataList)

        // 항목 클릭 이벤트 처리
        binding.listView.setOnItemClickListener{ parent, view, position, id ->
            val name: String = (binding.listView.adapter.getItem(position) as MyItem).aTitle
            Toast.makeText(this," $name 선택!", Toast.LENGTH_SHORT).show()
        }
    }
}