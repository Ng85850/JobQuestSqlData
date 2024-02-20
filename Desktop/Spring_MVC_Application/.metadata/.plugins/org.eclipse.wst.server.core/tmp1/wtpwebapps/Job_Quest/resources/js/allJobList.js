const slider = document.getElementById("slider");
const value = document.getElementById("value");

slider.addEventListener("input", function () {
  value.textContent = this.value;
});

function toggleBookmark(button) {
  var bookmarkPath = button.querySelector(".bookmark-path");
  if (bookmarkPath.getAttribute("fill") === "black") {
    bookmarkPath.setAttribute("fill", "white");
  } else {
    bookmarkPath.setAttribute("fill", "black");
  }
}
