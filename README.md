# WidgetExample

Android AppWidget Example

## appwidget-provier Options


minWidth, minHeight : 위젯의 최소 크기를 지정한다. 이에 따라 기본 사이즈가 정해진다.

updatePeriodMillis : 앱이 자동으로 업데이트 되는 주기(ms)를 정한다(최소 30분) 위젯 프로바이더의 onUpdate()를 호출함

previewImage : 위젯 생성 전 미리 보는 이미지, 없을 시 앱 아이콘으로 표시된다.

initialLayout : 앱 위젯의 레이아웃을 지정

configure : 위젯을 추가할 때 속성을 구성하기 위한 Activity 정의, 선택사항

resizeMode : 사용자가 홈 화면 위젯의 크기를 조절 할 수 있는 방향 정의, 모두 조절 가능 할 경우


## Enable Views

Layout
* FrameLayout
* LinearLayout
* RelativeLayout
* GridLayout

View
* AnalogClock
* Button
* Chronometer
* ImageButton
* ImageView
* ProgressBar
* TextView
* ViewFlipper
* ListView
* GridView
* StackView
* AdapterViewFlipper

## Approximate use of tiles

Note when specifying the minimum size of the widget

* 1	40dp
* 2	110dp
* 3	180dp
* 4	250dp

…

* n	70 * n - 30


## Reference

https://developer.android.com/guide/topics/appwidgets?hl=ko

