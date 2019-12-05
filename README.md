# Mobile Coding Challenge
This is an app that lists the most starred Github repositories that were created in the last 30 days. <br>
JSON Data is being fetched directly from the Github API  using <strong>Retrofit</strong> and <strong>Gson</strong> .<br>

<strong>Features :</strong><br>
- list the most starred Github repos that were created in the last 30 days.<br>
- listing One repository per row.<br>
- Diplaying the following details of each repository row :<br>
- Repository name<br>
- Repository description<br>
- Numbers of stars for the repo.<br>
- Username and avatar of the owner.<br>
- Pagination to show more result when Scrolling .<br>
<strong>Getting data from the server using Github API :</strong><br>

<h2>Open source API used :</h2> <br>

<strong>- Retrofit : </strong>Retrofit is a type-safe REST client for Android (or just Java) developed by Square. The library provides a powerful framework for authenticating and interacting with APIs and sending network requests with OkHttp. See this guide to understand how OkHttp works.<br>
This library makes downloading JSON or XML data from a web API fairly straightforward. Once the data is downloaded then it is parsed into a Plain Old Java Object (POJO) which must be defined for each "resource" in the response.<br>

<strong>- Gson :</strong> This is a Java library that can be used to convert Java Objects into their JSON representation. It can also be used to convert a JSON string to an equivalent Java object. Gson can work with arbitrary Java objects including pre-existing objects that you do not have source-code of.<br>

- We are using RecyclerView to Display data, this component is more powerfull then a ListView<br>


This is how the result looks like : <br>
`
![capture](https://) 
`
Rows structure is being like bellow : <br>

![row-explained](https://user-images.githubusercontent.com/4353553/35209538-7c91149a-ff46-11e7-9bb0-e300dd144110.png)
]()

<h2> Pagination explained : </h2>

The JSON data from Github is be paginated (30 repos per Json page)

To get the 2nd page, we add &page=2 to the end of the API request like bellow : <br>

https://api.github.com/search/repositories?q=created:>2017-10-22&sort=stars&order=desc&page=2 <br>

Using Retrofit Library, it is easy to do that by adding the 'page' parameter to the QueryMap like bellow : <br>

![3](https://)

<strong>currentPage</strong> is an incrementing variable according to every load



<h2>ScreenShot</h2>

![gif](https://)

<h2> How to use this project </h2>

clone the repository's link to your android studio like bellow : 

![1](https://)


