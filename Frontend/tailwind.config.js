/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}", // This line tells Tailwind to scan all relevant files in the src folder
  ],
  theme: {
    extend: {},
  },
  plugins: [],
}